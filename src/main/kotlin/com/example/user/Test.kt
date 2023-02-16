package com.example.user

import org.apache.commons.mail.HtmlEmail

fun main() {

    val to ="luca.bracchi3@studio.unibo.it"
    val hostName = "smtp.gmail.com"
    val googleAccount = "team.parkingslot@gmail.com"
    val appPassword = "vrluaueagxwttbtc"
    val port = 465
    val mailSubject = "Richiesta di cambio password"

    val email = HtmlEmail()
    email.hostName = hostName //live: smtp.live.com
    email.setSmtpPort(port)
//    email.setAuthenticator(DefaultAuthenticator(googleAccount, appPassword))
    email.setAuthentication(googleAccount, appPassword)
    email.isSSLOnConnect = true
    email.setFrom(googleAccount)
    email.subject = mailSubject
    email.setHtmlMsg("prova")
    email.addTo(to)
    email.send()

}

