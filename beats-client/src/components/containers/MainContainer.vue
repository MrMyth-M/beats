<template>
    <div class="ml-80 mr-60 text-left p-6">
        <h1 class="text-white text-5xl font-semibold mb-6">Albums</h1>
        <AlbumContainer :selectedAlbum="currentAlbum" @albumUpdate="updateAlbum"></AlbumContainer>
        <SongContainer :songs="currentSongs" @songSelect="selectSong" class="mt-12"></SongContainer>
    </div>
</template>

<script>
import AlbumContainer from "./main/AlbumContainer.vue"
import SongContainer from "./main/SongContainer.vue"
import { getSongsFromAlbum } from '../../scripts/rest'
export default {
    components: {
        AlbumContainer, SongContainer
    },

    data() {
        return {
            currentAlbum: undefined,
            currentSongs: undefined
        }
    },

    methods: {
        async updateAlbum(album) {
            this.currentAlbum = album
            this.currentSongs = await getSongsFromAlbum(album.id)
        },

        async selectSong(song) {
            this.$emit('songSelect', song)
        }
    }
}
</script>

<style>

</style>