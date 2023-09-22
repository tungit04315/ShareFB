// var myApp = angular.module("myApp", []);
//
//
// myApp.run(function ($http, $scope) {
//     $http.get(`/current-url`)
//         .then(resp => {
//             if (resp.data) {
//                 $scope.url_web = resp.data;
//                 console.log("nv" + resp.data)
//             } else {
//                 console.log("nv" + resp.data)
//                 $scope.url_web = "Khong co Du Lieu";
//             }
//         })
// });

// myApp.controller('myController', function($scope, $http) {
//     $scope.url_web = null;
//
//     $http.get(`/current-url`)
//         .then(resp => {
//             if(resp.data){
//                 $scope.url_web = resp.data;
//             }else{
//                 $scope.url_web = "Khong co Du Lieu";
//             }
//         })
// });

const copyIcon = document.querySelector(".input-box span");
const passwordInput = document.querySelector(".input-box input");

const copyPassword = () => {
    navigator.clipboard.writeText(passwordInput.value);
    // Tạo một thẻ <i>
    var iTag = document.createElement("i");

    // Thêm hai class vào thẻ <i>
    iTag.classList.add("fa-solid");
    iTag.classList.add("fa-check");

    copyIcon.innerText = "";
    copyIcon.appendChild(iTag);

    copyIcon.style.color = "#4285f4";
    setTimeout(() => {
        var iTag = document.createElement("i");

        // Thêm hai class vào thẻ <i>
        iTag.classList.add("fa-regular");
        iTag.classList.add("fa-copy");

        copyIcon.innerText = "";
        copyIcon.appendChild(iTag);

        copyIcon.style.color = "#707070";
    }, 1500);
}

copyIcon.addEventListener("click", copyPassword);

function setValue() {
    var inputValue = window.location.href;

    document.getElementById("myInput").value = inputValue;
}

