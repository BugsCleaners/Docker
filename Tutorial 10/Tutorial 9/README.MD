
##  Docker host-mounted volumes

`version: "3"`
`services:`
 `externalfile:`
    `image: "tutorial9"`
    `container_name: focused_engelbart`
    `volumes:`
      `- C:\\dockerfile:/var/dockerfile`


