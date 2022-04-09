<template>
    <div class="w-1/5 h-24 absolute text-white font-medium">
        <img class="h-full float-left mr-3" :src="song.coverUrl" alt="">
        <div class="text-left py-6">
            <p class="font-bold text-xl">{{ song.title }}</p>
            <p class="text-gray-200">{{ listArtists(song.artists) }}</p>
        </div>
        
    </div>
</template>

<script>
export default {
    data() {
        return {
            song: {title: 'Tokyo Drifting', artists: ['Glass Animals', 'Denzel Curry'], coverUrl: '../../../../public/album.jpg'}
        }
    },

    methods: {
        listArtists(aritsts) {
            let ret = ""
            for(const artist of aritsts) {
                ret += ", "
                ret += artist
            }
            return ret.substring(2, ret.length)
        }
    }
}
</script>

<style>

</style>