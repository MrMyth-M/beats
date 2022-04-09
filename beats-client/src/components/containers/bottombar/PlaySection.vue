<template>
    <div class="w-1/6 m-auto text-white py-2">
        <!-- Shuffle --->
        <button class="w-12 h-12 rounded-full hover:opacity-80">
            <icon icon="shuffle"/>
        </button>
        <!-- Previous --->
        <button class="w-12 h-12 rounded-full hover:opacity-80">
            <icon icon="backward-step"/>
        </button>
        <!-- PlayButton --->
        <button @click="onPlayClick" class="w-12 h-12 rounded-full hover:opacity-80 bg-slate-800">
            <icon class="" :icon="playButtonIcon"/>
        </button>
        <!-- Next --->
        <button class="w-12 h-12 rounded-full hover:opacity-80">
            <icon icon="forward-step"/>
        </button>
        <!-- Repeat --->
        <button class="w-12 h-12 rounded-full hover:opacity-80">
            <icon icon="repeat"/>
        </button>
    </div>
    <div class="w-1/2 m-auto text-white grid grid-cols-6">
        <p class="text-md text-right mx-2">{{ currentTime }}</p>
        <input id="audio-slider" @change="sliderChange" min="0" :max="this.audio?.duration" class="col-span-4 accent-slate-600" type="range">
        <p class="text-md text-left mx-2">{{ duration }}</p>
    </div>
    <audio class="absolute bottom-0 right-0" id="audio-element" :src="'http://localhost:3000/songs/' + song?.id + '.mp3'"></audio>
</template>

<script>
export default {
    props:['song'],

    data() {
        return {
            audio: undefined,
            slider: undefined,
            playButtonIcon: 'play',
            currentTime: "0:00",
            duration: "0:00"
        }
    },

    created() {
        setTimeout(() => {
                this.audio = document.getElementById('audio-element')
                this.audio.volume = "0.05"
                this.slider = document.getElementById('audio-slider')
                console.log(this.audio)
                setInterval(() => {
                    if(this.audio.currentTime != undefined) {
                        const timeInSeconds = Math.floor(this.audio.currentTime)
                        this.currentTime = new Date(timeInSeconds * 1000).toISOString().slice(14, 19)
                        this.slider.value = timeInSeconds
                    }
                }, 1000)
        }, 300)
        
    },

    methods: {
        async onPlayClick() {
            this.duration = new Date(this.audio.duration * 1000).toISOString().slice(14, 19)
            if(this.audio.paused) {
                this.audio.play()
                this.playButtonIcon = 'pause'
            }
            else {
                this.audio.pause()
                this.playButtonIcon = 'play'
            }
        },

        sliderChange(e) {
            this.audio.currentTime = this.slider.value
        }
    }


}
</script>

<style>

</style>