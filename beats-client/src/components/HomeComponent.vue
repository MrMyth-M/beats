<template>
    <div>
        <!-- Sidebar Left --->
        <SidebarLeft></SidebarLeft>
        <!-- Main Content --->
        <MainContainer @songSelect="selectSong"></MainContainer>
        <!-- Sidebar Right --->
        <SidebarRight></SidebarRight>
         <!-- Currently Playing  --->
        <BottomBar :song="selectedSong"></BottomBar>
    </div>
</template>

<script>
import SidebarLeft from "./containers/SidebarLeft.vue"
import SidebarRight from "./containers/SidebarRight.vue"
import BottomBar from "./containers/BottomBar.vue"
import MainContainer from "./containers/MainContainer.vue"
export default {
    components: {
        SidebarLeft, SidebarRight, BottomBar, MainContainer
    },

    data() {
        return {
            selectedSong: undefined
        }
    },

    async created() {
        
    },

    methods: {
        selectSong(song) {
            this.selectedSong = song
        }
    }
}
</script>

<style>

</style>