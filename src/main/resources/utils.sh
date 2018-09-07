#
#Set Colors
#

bold=$(tput bold)
underline=$(tput sgr 0 1)
reset=$(tput sgr0)

purple=$(tput setaf 171)
red=$(tput setaf 1)
green=$(tput setaf 2)
tan=$(tput setaf 3)
blue=$(tput setaf 38)
orange=$(tput setaf 208)
liteblue=$(tput setaf 006)

#
# Headers and  Logging
#

e_header() { printf "\n${bold}${orange}===============  %s  ===============${reset}\n" "$@"
}
e_arrow() { printf "  ➜ $@\n"
}
e_arrow_l1() { printf "    ➜ $@\n"
}
e_success() { printf "  ${green}✔ %s${reset}\n" "$@"
}
e_error() { printf "  ${red}✖ %s${reset}\n" "$@"
}
e_warning() { printf "  ${tan}➜ %s${reset}\n" "$@"
}
e_underline() { printf "  ${underline}${bold}%s${reset}\n" "$@"
}
e_bold() { printf "  ${bold}%s${reset}\n" "$@"
}
e_note() { printf "  ${underline}${bold}Note:${reset}  ${liteblue}%s${reset}\n" "$@"
}
