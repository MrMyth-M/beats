<template>
    <div class="w-1/5 h-24 absolute text-white font-medium opacity-80">
        <img class="h-full float-left mr-3" :src="this.song?.coverUrl" alt="">
        <div class="text-left py-6">
            <p class="font-bold text-xl">{{ song?.name }}</p>
            <p class="text-gray-200">{{ listArtists( song?.artists) }}</p>
        </div>
        
    </div>
</template>

<script>
export default {
    props: ['song'],



    methods: {
        listArtists(artists) {
            if(artists != undefined) {
                let ret = ""
                for(const artist of artists) {
                    ret += ", "
                    ret += artist.name
                }
                return ret.substring(2, ret.length)
            }
            return ""
        }
    }
}
</script>

<style>

</style>