# import pyrebase

# firebase = pyrebase.initialize_app(config)
# auth = firebase.auth()

# email = "test@gmail.com"
# password = "123456"

# # user = auth.create_user_with_email_and_password(email, password)
# # print(user)

# user = auth.sign_in_with_email_and_password(email, password)

# info = auth.get_account_info(user["idToken"])
# print(info)

# # email verficiation
# # auth.send_email_verification(user["idToken"])

# # reset password
# # auth.send_password_reset_email(email)