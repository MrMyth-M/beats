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
        <button class="w-12 h-12 rounded-full hover:opacity-80 bg-slate-800">
            <icon icon="play"/>
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
        <p class="text-md text-right mx-2">0:00</p>
        <input class="col-span-4 accent-slate-600" type="range">
        <p class="text-md text-left mx-2">0:00</p>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>