import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/dashboards',
      component: () => import('../components/DashboardView.vue'),
    },
    {
      path: '/files',
      component: () => import('../components/ui/FileGrid.vue'),
    },
    {
      path: '/indices',
      component: () => import('../components/ui/IndexGrid.vue'),
    },
    {
      path: '/videos',
      component: () => import('../components/ui/VideoGrid.vue'),
    },
  ],
})

export default router;
