# Java Event Planner
Version 0.0.0: September 9, 2016

by [Karen Freeman-Smith](https://github.com/karenfreemansmith)

## Description
A program estimate cost for various types of events

### Screenshot:
![project Screenshot](/screenshot.jpg)

### Specifications:
| Behavior                                           | Input                    |  Output                                                             |
|----------------------------------------------------|--------------------------|---------------------------------------------------------------------|
| Create event with properties of:                   |                          |                                                                     |
| name                                               | JavaMania - West         | JavaMania - West                                                    |
| date                                               | October 17, 2017         | October 17, 2017                                                    |
| venue                                              | Oregon Convention Center | Oregon Convention Center                                            |
| type (conference, wedding, etc)                    | Conference               | Conference, base cost = $1500/day                                   |
| days                                               | 3                        | base cost * days = $4500                                            |
| size (number of people attending)                  | 10,000                   | 10000, base cost - $12/person/day                                   |
| speakers (number of presenters)                    | 60                       | 60, cost - $500/person/day                                          |
| meals provided                                     | 1                        | 1, cost - $50/person/day                                            |
| snacks provided (includes non-alcoholic beverages) | 2                        | 2, cost - $15/person/day                                            |
| drinks provided (alcohol)                          | 2                        | 2, cost - $20/person/day                                            |
| total cost                                         | n/a                      | $4,054,500                                                          |
| savings suggester                                  | n/a                      | "eliminate meal (saves $1,500,000)","reduce drinks (saves $600,000)"|
| break even cost per attendee                       | n/a                      | $405.45                                                             |

## Setup/Installation
* Clone directory
* Run gradle compileJava
* navigate to build/classes/main
* run program by typing "java App"

## Support & Contact
For questions, concerns, or suggestions please email karenfreemansmith@gmail.com

## Known Issues
* This program runs only from the command line

## Technologies Used
Java, Gradle, junit

## Legal
*Licensed under the GNU General Public License v3.0*

Copyright (c) 2016 Copyright _Karen Freeman-Smith_ All Rights Reserved.
