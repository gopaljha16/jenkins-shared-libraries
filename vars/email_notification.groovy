def call(String fromEmail, String toEmail, String status) {
    if (status == 'SUCCESS') {
        emailext(
            from: fromEmail,
            to: toEmail,
            subject: 'Build Success',
            body: 'Deployed successfully. Please check your application.'
        )
    }

    if (status == 'FAILURE') {
        emailext(
            from: fromEmail,
            to: toEmail,
            subject: 'Build Failed',
            body: 'Build failed. Check Jenkins console logs.'
        )
    }
}
