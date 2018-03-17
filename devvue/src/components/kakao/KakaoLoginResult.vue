<template>
  
</template>

<script>
import querystring from 'querystring'

export default {
  name: 'kakao-login-result',
  mounted () {
    if (this.$route.query.error === 'access_denied') {
      alert(this.$route.query.error)
      this.$router.push('/')
    } else {
      var kakaoAuthorizeCode = this.$route.query.code
      var kakaoClientId = this.kakao.clientId
      var kakaoRedirectUri = this.kakao.redirectUri
      var kakaoClientSecret = this.kakao.clientSecret

      let data = querystring.stringify({
        grant_type: 'authorization_code',
        client_id: kakaoClientId,
        redirect_uri: kakaoRedirectUri,
        code: kakaoAuthorizeCode,
        client_secret: kakaoClientSecret
      })

      this.axios.post('https://kauth.kakao.com/oauth/token', data)
      .then(res => {
        console.log(res)
        /*
        window.close()
        this.$router.push('/main')
        */
        this.$router.replace('/main')
      })
      .catch(err => {
        console.log(err)
        /*
        window.close()
        this.$router.push('/')
        */
        this.$router.replace('/')
      })
    }
  }
}
</script>

<style scoped>

</style>
