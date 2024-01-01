const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
const PORT = process.env.PORT || 4000;
mongoose.connect('mongodb://localhost:27017/userRegistration', { useNewUrlParser: true, useUnifiedTopology: true });
const userSchema = new mongoose.Schema({
     username: String,
     email: String,
     password: String
 });
 const User = mongoose.model('User', userSchema);
 app.use(bodyParser.json());
 app.use(express.static('public'));
 app.post('/register', async (req, res) => {
     try {
          const { username, email, password } = req.body;
          const newUser = new User({
               username,
               email,
               password
           });
           await newUser.save();
           res.status(201).send('User registered successfully!');
          } catch (error) {
              console.error(error);
              res.status(500).send('Internal Server Error');
          }
      });
      app.listen(PORT, () => {
          console.log(`Server is running on http://localhost:${PORT}`);
      });