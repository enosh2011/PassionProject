    // Import the functions you need from the SDKs you need
    import { initializeApp } from "https://www.gstatic.com/firebasejs/12.10.0/firebase-app.js";
    import { getAnalytics } from "https://www.gstatic.com/firebasejs/12.10.0/firebase-analytics.js";
    import { getAuth, createUserWithEmailAndPassword } from "https://www.gstatic.com/firebasejs/12.10.0/firebase-auth.js";

    // TODO: Add SDKs for Firebase products that you want to use
    // https://firebase.google.com/docs/web/setup#available-libraries
  
    // Your web app's Firebase configuration
    // For Firebase JS SDK v7.20.0 and later, measurementId is optional
    const firebaseConfig = {
      apiKey: "AIzaSyCJx2GIZTuFKT-2_Ve0bxKJGq739UHMsa8",
      authDomain: "passionproject-75900.firebaseapp.com",
      projectId: "passionproject-75900",
      storageBucket: "passionproject-75900.firebasestorage.app",
      messagingSenderId: "344737474044",
      appId: "1:344737474044:web:8a23d2f2d042c553017e79",
      measurementId: "G-6R7DFJ1GN3"
    };
  
    // Initialize Firebase
    const app = initializeApp(firebaseConfig);
    const analytics = getAnalytics(app);
    const auth = getAuth(app);

//logins
const submit = document.getElementById('submit');
submit.addEventListener("click", function (event) {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    event.preventDefault();
    createUserWithEmailAndPassword(auth, email, password)
  .then((userCredential) => {
    // Signed up 
    const user = userCredential.user;
    alert("Creating Account...")
    window.location.href = "index.html";
    // ...
  })
  .catch((error) => {
    const errorCode = error.code;
    const errorMessage = error.message;
    alert(errorMessage)
    // ..
  });

})

//action="/login" method="POST"