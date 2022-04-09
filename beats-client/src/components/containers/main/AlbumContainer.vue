<template>
    <div class="w-full grid grid-cols-5 gap-6">
        <div :class="{'scale-110': selectedAlbum.id == dto.album.id}"  @click="this.$emit('albumUpdate', dto.album)" class="w-60 h-60 bg-slate-800 rounded-lg opacity-80 p-1.5 hover:scale-110 duration-300 cursor-pointer" v-for="dto in albumDTOs" :key="dto.id">
            <img class="w-full rounded-md mb-5" :src="dto.album.coverUrl" alt="">
            <p class="text-white text-xl mt-0.5 -mb-1.5 truncate">{{ dto.album.name }}</p>
            <p class="text-gray-300 text-lg">{{ dto.artist.name }}</p>
        </div>
        <h1>hello</h1>
    </div>
</template>

<script>
import { getAllAlbums } from '../../../scripts/rest'
export default {
    props:['selectedAlbum'],
    data() {
        return {
            albumDTOs: undefined
        }
    },

    async created() {
        this.albumDTOs = await getAllAlbums()
        this.$emit('albumUpdate', this.albumDTOs[0].album)
    }
}
</script>

<style>

</style>