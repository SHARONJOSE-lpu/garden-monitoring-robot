npm init -y
npm install express
const express =
require('express');
const app = express();
const port = 3000;

// Middleware to serve static files (e,g,'images, CSS HTML)
app.use(express,static('publiv'));

//Middleware to parse incoming JOSN data
app.use(express.json());

//Basic route to serve the main HTML page
app.get('/',(req,res)=> { res.sendFile(--dirname+ '/public/hackathon1.html');});

//API route example for fetching messages
app.get('/api/messages',(res,req))=> {
    // This is just an example. yoy would fetch messages from a database or some other data sources.
    res.json([
        { id: 1, text:
        "messages 1"},
        {id;2,text:
        "message 2"},
    ]);
});

//save the messages to a database or some other storage
console.log(newMesages);

res.status(201).json(newMessage);
});

app.listen(port,() => {
    console.log('server running on http://loalhost:
    ${port}');
});

