import mongoose from "mongoose";

//Conexão no Atlas
mongoose.connect("mongodb+srv://alura:123@alura.jwfzgkj.mongodb.net/alura-node");

let db = mongoose.connection;

export default db;