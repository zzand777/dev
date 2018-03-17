import Vue from 'vue'
import Router from 'vue-router'
import DevIndex from '@/components/page/index/DevIndex'
import DevMain from '@/components/page/main/DevMain'
import KakaoLoginResult from '@/components/kakao/KakaoLoginResult'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'index',
      component: DevIndex
    },
    {
      path: '/main',
      name: 'main',
      component: DevMain
    },
    {
      path: '/KakaoLoginResult',
      name: 'KakaoLoginResult',
      component: KakaoLoginResult
    }
  ]
})
