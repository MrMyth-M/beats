<template>
    <div class="h-24 w-screen fixed bottom-0 bg-slate-900">
        <div class="m-auto">
            <SongDisplay :song="this.song"></SongDisplay>
            <PlaySection :song="this.song"></PlaySection>
        </div>
    </div>
</template>

<script>
import PlaySection from "./bottombar/PlaySection.vue"
import SongDisplay from "./bottombar/SongDisplay.vue"
export default {
    props: ['song'],

    components: {
        PlaySection, SongDisplay
    }
}
</script>

<style>

</style>