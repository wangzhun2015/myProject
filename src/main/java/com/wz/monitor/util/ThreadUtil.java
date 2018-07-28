package com.wz.monitor.util;

public class ThreadUtil {
	/**
	     * 
	     */
	    public static synchronized boolean interruptThread(long threadID){
	    	Thread[] threads= getAllThread();
	    	
	        for (Thread thread: threads){
	            if ( thread != null &&( thread.getId()== threadID) ){ 
	            	System.out.println(thread.getState());
	            	System.out.println(thread.getState());
	                if ( Thread.State.RUNNABLE.equals(thread.getState())||Thread.State.TIMED_WAITING.equals(thread.getState()) ){
	                    try{
	                        thread.interrupt();
	                        return true;
	                    } catch (Throwable t){
	                    	//t.printStackTrace();
	                        ; // Swallow any exceptions.
	                    }
	                }
	            }
	        }
	        return false;
	    }
	    
	    public static Thread[] getAllThread(){
	    	ThreadGroup group = Thread.currentThread().getThreadGroup();  
	    	ThreadGroup topGroup = group;  
	    	// 遍历线程组树，获取根线程组  
	    	while (group != null) {  
	    	    topGroup = group;  
	    	    group = group.getParent();  
	    	}  
	    	// 激活的线程数加倍  
	    	int estimatedSize = topGroup.activeCount() * 2;  
	    	Thread[] slackList = new Thread[estimatedSize];  
	    	// 获取根线程组的所有线程  
	    	int actualSize = topGroup.enumerate(slackList);  
	    	// copy into a list that is the exact size  
	    	Thread[] list = new Thread[actualSize];  
	    	System.arraycopy(slackList, 0, list, 0, actualSize);  
	    	System.out.println("Thread list size == " + list.length);  
	    	/*for (Thread thread : list) {  
	    	    System.out.println(thread.getId());  
	    	} */
	    	return list;
	    }
}

