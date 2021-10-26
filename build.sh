./configure

CPU_THREADS=`cat /proc/cpuinfo| grep "processor"| wc -l`
make JOBS=${CPU_THREADS} all
