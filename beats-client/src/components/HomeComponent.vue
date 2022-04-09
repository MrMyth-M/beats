<template>
    <div>
        <!-- Sidebar Left --->
        <SidebarLeft></SidebarLeft>
        <!-- Sidebar Right --->
        <SidebarRight></SidebarRight>
         <!-- Currently Playing  --->
        <BottomBar></BottomBar>
    </div>
</template>

<script>
import SidebarLeft from "./containers/SidebarLeft.vue"
import SidebarRight from "./containers/SidebarRight.vue"
import BottomBar from "./containers/BottomBar.vue"
import { getAllAlbums } from "../scripts/rest"
export default {
    components: {
        SidebarLeft, SidebarRight, BottomBar
    },

    data() {
        return {
            albums: undefined
        }
    },

    async created() {
        this.albums = await getAllAlbums()
        console.log(this.albums[0]);
    }
}
</script>

<style>

</style>