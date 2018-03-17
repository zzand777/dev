<template>
  <img :src="kakaoButton" :class="$style.kakaoLoginButtonContainer" @click="kakaoLogin" @mouseover="overFlag = true" @mouseout="overFlag = false"/>
</template>

<script>
import kakaoButtonImage from '@/assets/kakao/kakao_account_login_btn.png'
import kakaoButtonImageOver from '@/assets/kakao/kakao_account_login_btn_ov.png'

export default {
  name: 'kakao-login-button',
  data () {
    return {
      overFlag: false
    }
  },
  methods: {
    kakaoLogin () {
      /*
      window.open('https://kauth.kakao.com/oauth/authorize?client_id=' + this.kakao.clientId + '&redirect_uri=' + this.kakao.redirectUri + '&response_type=code', 'kakaoLogin')
      window.location.replace = 'https://kauth.kakao.com/oauth/authorize?client_id=' + this.kakao.clientId + '&redirect_uri=' + this.kakao.redirectUri + '&response_type=code'
      */
      window.location.href = 'https://kauth.kakao.com/oauth/authorize?client_id=' + this.kakao.clientId + '&redirect_uri=' + this.kakao.redirectUri + '&response_type=code'
    }
  },
  computed: {
    kakaoButton () {
      return this.overFlag ? kakaoButtonImageOver : kakaoButtonImage
    }
  }
}
</script>

<style module scoped>
.kakaoLoginButtonContainer {
  width:100%;
  cursor: pointer;
}
</style>
