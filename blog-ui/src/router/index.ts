import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/login',
    name: 'login',
    component: () => import('../views/login.vue')
  },
  {
    path: '/',
    name: 'index',
    component: () => import('../views/index.vue'),
    children: [
      {
        path: '/index',
        name: '首页',
        component: () => import('../views/indexPage.vue')
      },
      {
        path: '/system/users',
        name: '用户管理',
        component: () => import('../views/system/users.vue')
      },
      {
        path: '/system/roles',
        name: '角色管理',
        component: () => import('../views/system/roles.vue')
      },
      {
        path: '/system/menus',
        name: '菜单管理',
        component: () => import('../views/system/menus.vue')
      },
      {
        path: '/system/configs',
        name: '参数设置',
        component: () => import('../views/system/configs.vue')
      },
      {
        path: '/blogs',
        name: '博客管理',
        component: () => import('../views/blog/blogs.vue')
      },
      {
        path: '/monitor/onlines',
        name: '在线用户',
        component: () => import('../views/monitor/onlines.vue')
      },
      {
        path: '/monitor/serves',
        name: '服务监控',
        component: () => import('../views/monitor/serves.vue')
      },
      {
        path: '/monitor/cache',
        name: '缓存监控',
        component: () => import('../views/monitor/cache.vue')
      }
    ]
  },

  

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
