<template>
  <div>
      dev-main
  </div>
</template>

<script>
export default {
  name: 'dev-main',
  mounted () {
    this.axios.post('', {})
    .then(res => {
      console.log(res)
    })
    .catch(err => {
      console.log(err)
    })
  }
}
</script>

<style scoped>

</style>
