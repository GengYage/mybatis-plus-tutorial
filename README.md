### NOTE
please add this script into you local git repository. path: `.git/hook`
```shell
#!/bin/sh
#
# remove the password
git diff --cached --name-only | grep 'src/main/resources/application.yml'  | xargs sed -i 's/\(password:\s\)[^\s]*/\1*/'
git add -u
```
### mybatis-plus-tutorial
wrapper use
join query
