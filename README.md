# gitHub_Actions_Demo

manual workflow run by below script
script for custom_event repository_dispatch
gh api \
  --method POST \
  -H "Accept: application/vnd.github+json" \
  -H "X-GitHub-Api-Version: 2022-11-28" \
  /repos/pankaj-prasad/gitHub_Actions_Demo/dispatches \
   -f 'event_type=custom-event'

   script for webhook event repository_dispatch

gh api \
  --method POST \
  -H "Accept: application/vnd.github+json" \
  -H "X-GitHub-Api-Version: 2022-11-28" \
  /repos/pankaj-prasad/gitHub_Actions_Demo/dispatches \
   -f 'event_type = webhook'   

