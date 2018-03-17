<template>
  <div>
    <b-container fluid>
      <b-row>
        <b-col :class="$style.mainContainer" cols="12" sm="8" md="6" lg="4" xl="2">
          <kakao-login-button/>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import KakaoLoginButton from '@/components/kakao/KakaoLoginButton'

export default {
  name: 'dev-index',
  components: {
    KakaoLoginButton
  },
  data () {
    return {
      name: ''
    }
  },
  methods: {
    testGet () {
      this.axios.get('/dev/company', {}).then(res => {
        alert('ok')
      }).catch(error => {
        alert(error.message)
      })
    }
  },
  computed: {
    nameState () {
      return this.name.length > 2
    }
  }
}
</script>

<style module scoped>
.mainContainer {
  padding: 10px;
  margin: 0 auto;
  border: 1px solid #d8dee2;
}
</style>
