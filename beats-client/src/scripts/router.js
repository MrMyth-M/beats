import { createWebHistory, createRouter } from "vue-router";
import Home from "../components/HomeComponent.vue";

const routes = [
    {
        path: "/",
        name: "default",
        redirect: "home",
    },
    {
        path: "/home",
        name: "home",
        component: Home,
    },
  
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;