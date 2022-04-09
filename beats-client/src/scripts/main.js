import { createApp } from 'vue'
import App from '../App.vue'
import '../../index.css'
import router from "./router"
// FontAwesome Icons
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { library } from '@fortawesome/fontawesome-svg-core'
import { fas } from '@fortawesome/free-solid-svg-icons'

library.add(fas)

createApp(App).use(router).component('icon', FontAwesomeIcon).mount('#app')
