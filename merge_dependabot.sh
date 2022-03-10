#!/bin/sh

if [[ -z "${GITHUB_TOKEN}" ]]; then
gh pr merge --auto --rebase "$PR_URL"
else
echo 'if you want github to automatically merge pull requests from dependdabot, you need to create a' 
echo 'personal access token (public_repo) and assign it to setings -> secrets -> dependabot -> GH_ACTION_TOKEN'
fi