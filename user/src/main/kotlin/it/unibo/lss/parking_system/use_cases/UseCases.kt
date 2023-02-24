package it.unibo.lss.parking_system.use_cases

import it.unibo.lss.parking_system.entity.UserCredentials
import it.unibo.lss.parking_system.interface_adapter.model.request.SignUpRequestBody
import it.unibo.lss.parking_system.interface_adapter.model.response.ServerResponseBody
import it.unibo.lss.parking_system.interface_adapter.model.response.SigningResponseBody
import it.unibo.lss.parking_system.interface_adapter.model.response.UserInfoResponseBody

interface UserUseCases {

    fun login(credentials: UserCredentials, tokenSecret: String): SigningResponseBody
    fun createUser(signUpRequestBody: SignUpRequestBody, tokenSecret: String): SigningResponseBody
    fun recoverPassword(mail: String, tokenSecret: String): ServerResponseBody
    fun getUserInfo(mail: String): UserInfoResponseBody
    fun changePassword(mail: String, newPassword: String, currentPassword: String?): ServerResponseBody
    fun deleteUser(mail: String): ServerResponseBody

    fun validateCredentials(credentials: UserCredentials): Boolean
    //utility function: check if there is a user with this mail in the collection
    fun userExists(mail: String): Boolean

}