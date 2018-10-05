#!/bin/bash

export languageName="${languageName:-enUS}"
export appName="${appName:-computate}"
export appPath="${appPath:-$(readlink -f $( dirname $( dirname $( dirname ${BASH_SOURCE[0]} ) ) ) )}"
export appComputatePath="${appComputatePath:-$appPath}"
export configFileName="${appName}.config"
export configPath="$appPath/config/$configFileName"

function computate() {
	echo "Do you want to execute the command below? "
	echo
	echo "$1"
	read -p '[s]kip, [q]uit ou [Enter] to continue: ' -i '' ACTION_COMMAND
	case $ACTION_COMMAND in 
		[Ss]* );;
		[Qq]* ) exit 0 ;;
		* )
		eval "$1"
		;;
	esac
}

if [ ! -f $configPath ]; then
	computate "cp $appPath/config/$languageName/$configFileName $configPath"
fi

function config_var {
	config_var=$(cat "$configPath" | perl -0777ne 'print "$1" if /\[\s*'"$1"'\s*\][\s\S]*?\s+'"$2"'\s*=\s*(.*)\s*/')
	export "$2"="${config_var}"
}

config_var maven versionMaven
export versionMaven="${versionMaven:-3.5.3}"

config_var zookeeper versionZookeeper
export versionZookeeper="${versionZookeeper:-3.5.4}"
config_var zookeeper prefixePortZookeeper
export prefixePortZookeeper="${prefixePortZookeeper:-102}"
config_var zookeeper portClientZookeeper
export portClientZookeeper="${portClientZookeeper:-${prefixPortZookeeper}81}"
config_var zookeeper portAdminZookeeper
export portAdminZookeeper="${portAdminZookeeper:-${prefixPortZookeeper}80}"

config_var solr versionSolr
export versionSolr="${versionSolr:-7.3.1}"
config_var solr prefixePortSolr
export prefixePortSolr="${prefixePortSolr:-103}"
config_var solr portSolr
export portSolr="${portSolr:-${prefixePortSolr}83}"
export URL_SOLR="http://localhost:${portSolr}/solr"