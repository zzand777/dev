<template>
  <div>
    <b-navbar type="dark" variant="primary" toggleable>
      <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>

      <b-navbar-brand href="#">NavBar</b-navbar-brand>

      <b-collapse is-nav id="nav_dropdown_collapse">
        <b-navbar-nav>
          <b-nav-item href="#">Home</b-nav-item>
          <b-nav-item href="#">Link</b-nav-item>
          <!-- Navbar dropdowns -->
          <b-nav-item-dropdown text="Lang" right>
            <b-dropdown-item href="#">EN</b-dropdown-item>
            <b-dropdown-item href="#">ES</b-dropdown-item>
            <b-dropdown-item href="#">RU</b-dropdown-item>
            <b-dropdown-item href="#">FA</b-dropdown-item>
          </b-nav-item-dropdown>
          <b-nav-item-dropdown text="User" right>
            <b-dropdown-item href="#">Account</b-dropdown-item>
            <b-dropdown-item href="#">Settings</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>


        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">

          <b-nav-form>
            <b-form-input size="sm" class="mr-sm-2" type="text" placeholder="Search"/>
            <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
          </b-nav-form>

          <b-nav-item-dropdown text="Lang" right>
            <b-dropdown-item href="#">EN</b-dropdown-item>
            <b-dropdown-item href="#">ES</b-dropdown-item>
            <b-dropdown-item href="#">RU</b-dropdown-item>
            <b-dropdown-item href="#">FA</b-dropdown-item>
          </b-nav-item-dropdown>

          <b-nav-item-dropdown right>
            <!-- Using button-content slot -->
            <template slot="button-content">
              <em>User</em>
            </template>
            <b-dropdown-item href="#">Profile</b-dropdown-item>
            <b-dropdown-item href="#">Signout</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>

      </b-collapse>

    </b-navbar>

    <b-container fluid>
      <b-row>
        <b-col md="3" xl="2">
          3
        </b-col>
        <b-col md="9" xl="10">
          <b-input-group prepend="Username">

            <b-form-input id="inputLive"
                          v-model.trim="name"
                          type="text"
                          :state="nameState"
                          aria-describedby="inputLiveHelp inputLiveFeedback"
                          placeholder="Enter your name"></b-form-input>


            <b-form-invalid-feedback id="inputLiveFeedback">
              Enter at least 3 letters
            </b-form-invalid-feedback>
            <b-form-text id="inputLiveHelp">
              <!-- this is a form text block (formerly known as help block) -->
              Your full name.
            </b-form-text>

            <b-input-group-append>
              <b-btn variant="outline-success" @click="testGet">Button1</b-btn>
              <b-btn variant="info">Button2</b-btn>
            </b-input-group-append>

          </b-input-group>

          


        </b-col>
      </b-row>
    </b-container>

  </div>
  
</template>

<script>
export default {
  name: 'dev-index',
  data () {
    return {
      name: ''
    }
  },
  methods: {
    testGet () {
      alert(0)
      this.$http.get('', {}).then(res => {
        alert('ok')
      }).catch(error => {
        alert(error.response)
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

<style scoped>

</style>
