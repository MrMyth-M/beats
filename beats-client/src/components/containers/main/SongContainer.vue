<template>
    <div>
        <h1 class="text-5xl text-white font-semibold mb-4">Songs</h1>
        <div class="grid grid-cols-4 text-white ml-4">
            <p>#</p>
            <p>Name</p>
            <p>Artists</p>
            <p class="text-right">Duration</p>
        </div>
        <div @click="this.$emit('songSelect', song)" v-for="song in songs" :key="song.id" class="w-full bg-slate-800 my-2 rounded-xl hover:scale-[101%] cursor-pointer duration-200">
            <div class="grid grid-cols-4 text-gray-200 text-md opacity-80">
                <div>
                    <icon class="float ml-4 mt-5" icon="play"/>
                    <img class="float-left w-1/6 rounded-xl p-1" :src="song.coverUrl" alt="">
                </div>
               
                <p class="p-4">{{ song.name }}</p>
                <p class="p-4">{{ getArtistString(song.artists) }}</p>
                <p class="p-4 text-right">0:00</p>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    props:['songs'],

    methods: {
        getArtistString(artists) {
            let text = ""
            for(const artist of artists) {
                text += ", "
                text += artist.name
            }
            return text.substring(2, text.length)
        }
    }
}
</script>

<style>

</style>