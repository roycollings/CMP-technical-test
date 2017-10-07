# Answer

## Login (SSH) into a server with IP 45.65.34.23, user root and a private key / identity file called “MyPrivateKey.key”
* Ensure the MyPrivateKey.key file has the correct permissions by running this command:

  `chmod 600 MyPrivateKey.key`

  (you could use  `chmod 400 MyPrivateKey.key`  as well - as long as only the 'user' can access the file, not 'group' or 'all')

* Run the following command to connect to the server:

  `ssh -i MyPrivateKey.key root@45.65.34.23`

## Go to folder “/var/logs”
Type:

  `cd /var/logs`

## Show on console the latest 30 lines of the file “super-app.log"
Type:

  `tail -30 super-app.log`

