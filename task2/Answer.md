# Answer

## Initial focus
First I would regression test the critical areas of the application, starting with the most important functionality first, i.e.: 

    1. logging in.
    2. sending and recieving a message to one contact.
    3. sending and recieving a message with multiple contacts.
    4. Calling a contact (audio).
    5. Calling a contact (video).
    6. adding a contact.
    7. deleting a contact.

... after these 'essential' areas of functionality, if I had time I would test important (but less essential) areas, i.e.:

## Secondary focus
    8. adding smileys to a message.
    9. adding gifs to a message.

At all times I would be watching for any regression or new defects in the GUI layout and (if applicable in the test system) response times.

## If my 10 minutes still aren't up ..
Once these critial areas are tested, I would consider the following:

    1. Historically are there any 'brittle' areas of this application (that can regress easily)?
    2. Do I know of any new features in this release?

Depending on the answers to these questions I might test the brittle areas of the application or test the new feature (quick sanity test only): 

- If there are many brittle areas and the new feature is very important I would test the new feature first at the point. 
- If the new feature is not so important then I would probably focus on the regression testing of brittle areas.
