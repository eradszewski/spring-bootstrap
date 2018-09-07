# Import StdOut
source utils.sh
## EXAMPLE Output Format
#e_arrow "I am a Arrow"
#e_header "I am a sample script"
#e_success "I am a success message"
#e_error "I am an error message"
#e_warning "I am a warning message"
#e_underline "I am underlined text"
#e_bold "I am bold text"
#e_note "I am a note"


#Print the Banner from utils.sh
banner



# Array registry def
declare -a registry=("usdev022.usu.usu.grp")


e_header "start Valumation installation"
e_success "Initialization of the Valuemation Container registry connection."
e_success "Connecet to :"
for r in "${registry[@]}"
do
   e_arrow_l1 "$r"
   e_note "Internal Valuemation Registry ($r) without SSL"
done
e_warning "Default machine not avalible"
e_error "SSL zert not found"
e_success "proxy connection was initialized"
e_success "service discovery connection was initialized"
e_success "time zone was chaged"
e_note "Timzone is Berlin/Germany"
e_success "Metadata import done"
e_header "start application server"
e_success "UP: BO-Service"
e_success "UP: USER-Service"
e_success "UP: TICKET-Service"
e_success "UP: USER-MNGM-Service"
e_error "DOWN: CONFIG-Serivice"
e_note "Local config was initialized"
e_header "start sucessfull"
e_underline "Connect on:"
e_arrow "Kibana http://kibana"
e_arrow "Kibana http://valuemation"