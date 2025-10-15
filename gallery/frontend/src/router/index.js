import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/Home.vue')
    },
    {
     path: '/join',
     name: 'join',
     component: () => import('../views/Join.vue')
    },
    {
     path: '/login',
     name: 'login',
     component: () => import('../views/Login.vue')
    },
    {
     path: '/cart',
     name: 'cart',
     component: () => import('../views/Cart.vue')
    },
    {
     path: '/order',
     name: 'orderForm',
     component: () => import('../views/OrderForm.vue')
    },
  ]
});

export default router
