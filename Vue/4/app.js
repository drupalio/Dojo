
 var vm = new Vue({
  el: '#container',
  computed: {
    data: function () {
      			debugger;
    			axios.get('http://drupalio.com/wp-json/wp/v2/users')
				.then(function (response) {
				  	return response;
				})
				.catch(function (error) {
				    return error;
				 });
    }
  }
})