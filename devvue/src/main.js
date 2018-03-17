// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import App from './App'
import router from './router'
import axios from 'axios'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.use(BootstrapVue)
Vue.config.productionTip = false
Vue.prototype.axios = axios
Vue.prototype.kakao = {
  clientId: 'bc9883270b96b922857ec3304858a967',
  clientSecret: 'HQWfvSTdxByJ3FQWnpUvIpKXNDktY2YW',
  redirectUri: 'http://116.37.190.72:8081/KakaoLoginResult'
}

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})
