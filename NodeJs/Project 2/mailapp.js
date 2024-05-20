//Email send

const mailer=require('nodemailer');

let transport=mailer.createTransport({
    service:'gmail',
    auth:{
        user:'heyaniketkhatalemail@gmail.com',
        pass:'#Aniket@123'
    }
})

let messgaeOb={
    from:'heyaniketkhatal@gmail.com',
    to:'missionaug24@gmail.com',
    subject:'Sending email Using Node js express js',
    text:'This mail send using the node js'
}
transport.sendMail(messgaeOb,(error, info) => {
    if (error) {
        console.log(error);
        } else {
            console.log('Email sent: ' + info.response);
            console.log(info.response);
        }
});