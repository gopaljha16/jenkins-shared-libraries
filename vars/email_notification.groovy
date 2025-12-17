def call(String from_email , String to_email ){
    success{
        script{
            emailext from:"${from_email}",
            to:"${to_email}",
            body:"Deployed Successfully your node application check in your ip",
            subject:"Build sucesss"
    }
    }
    failure{
        script{
            emailext from:"${from_email}",
            to:"${to_email}",
            body:"Build Failed Check the console for more information",
            subject:"Build Failed"
    }
    }
}