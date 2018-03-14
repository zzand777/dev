import Vue from 'vue'
import Router from 'vue-router'
import DevIndex from '@/components/page/index/DevIndex'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: DevIndex
    }
  ]
})
