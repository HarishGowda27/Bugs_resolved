package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Locators_Pages {

public static WebElement element = null;

//Driver
		public  static WebElement Driver(WebDriver driver)
		{
			System.setProperty("webdriver.chrome.driver","C:\\System\\Adrivers_CU\\new selenium\\chrome driver\\chromedriver.exe");
			return element;
		}

	//server IP**
	public  static WebElement Navigate(WebDriver driver)
	{
		driver.navigate().to("http://10.0.0.202/");
		return element;
	}
	
	//username**
		public  static WebElement Username(WebDriver driver)
		{
		   WebElement user = driver.findElement(By.name("username"));
		    user.sendKeys("admin");
			return element;
		}
		
		//password**
		public  static WebElement Password(WebDriver driver)
		{
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.sendKeys("pixfix@123");
			return element;
		}
	
	//window
		public  static WebElement Window_maximize(WebDriver driver)
		{
			driver.manage().window().maximize();
			return element;
		}
	
	//submit 
	public  static WebElement Submit(WebDriver driver)
	{
		WebElement click11 = driver.findElement(By.name("submit"));
		click11.click();
		return element;
	}
	
	//jobs pixflex-menu-jobs
	public  static WebElement jobs_dropdown(WebDriver driver)
	{
	    element = driver.findElement(By.id("pixflex-menu-jobs"));
	    return element;
	}
	
	//Versa jobs versa_active
	public  static WebElement Versa_job(WebDriver driver)
	{
	    WebElement click9 = driver.findElement(By.id("versa_active"));
		click9.click();
	    return element;
	}
	
	//New job btn btn-primary pixflex-cursor pixflex-tooltip
	public  static WebElement Versa_job_new(WebDriver driver)
	{
	    WebElement click8= driver.findElement(By.linkText("New"));
		click8.click();
	    return element;
	}
	
	
	
	
	//Input********
	//Filestream
	public  static WebElement Filein(WebDriver driver)
	{
	    WebElement click6 = driver.findElement(By.id("versa_src_filestream"));
		click6.click();
	    return element;
	}
	
	//Udp sink_udp_ip
	public  static WebElement Udpin_ip(WebDriver driver)
	{
	    WebElement udp = driver.findElement(By.id("sink_udp_ip"));
		udp.click();
	    return element;
	}
	//************
	

	//Udp Multi cast*******
	// udp select
	public  static WebElement Udpin(WebDriver driver) {
	 WebElement udp = driver.findElement(By.id("versa_src_udp"));
		udp.click();
	    return element;
	}
	
	
	//Udpin
	public  static WebElement Udpin_Multicast_ip(WebDriver driver)
	{
		driver.findElement(By.id("gstaf_src_udp_ip")).clear();
		driver.findElement(By.id("gstaf_src_udp_ip")).sendKeys("224.0.1.203"); 
		return element;
	}
	
		
	//Interface load	
		public  static WebElement Udp_Multicast_Port(WebDriver driver)
		{
		    WebElement clickes = driver.findElement(By.id("gstaf_src_udp_port"));
		    clickes.sendKeys("6000"); 
		    return element;
	    }
	
	//drop down Interface gstaf_src_udp_interface
		public  static WebElement Multicast_load_interface(WebDriver driver)
		{
		    WebElement clickes = driver.findElement(By.xpath("//*[@id=\"live_input_interface\"]/div[3]/a"));
		    clickes.click();
		    return element;
	    }
	
	//click interface select	 gstaf_src_udp_interface
		public  static WebElement Multicast_Select_interface(WebDriver driver)
		{

			Select drpCountry = new Select(driver.findElement(By.id("gstaf_src_udp_interface")));
			drpCountry.selectByVisibleText("eno2");
		    return element;
	    }
		
	//**********************
	
	
	//*********************
	
	//udpout*****
	//udpin ip
	public  static WebElement Udpout_ip(WebDriver driver)
	{
		driver.findElement(By.id("gstaf_sink_udp_ip_1")).clear();
		driver.findElement(By.id("gstaf_sink_udp_ip_1")).sendKeys("10.0.0.39");
		return element;
	}
	
	//udp port gstaf_sink_udp_port_1
	public  static WebElement Udpout_port(WebDriver driver)
	{
	    element = driver.findElement(By.id("gstaf_sink_udp_port_1"));
	    return element;
	}
	
	//load interface click
	public  static WebElement load_interface(WebDriver driver)
	{
	    element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[4]/div[1]/div[2]/div[5]/a/i"));
	    return element;
	}
	
	//muxer bitrate muxer_ts_bitrate_1
	public  static WebElement udpout_muxer_bitrate(WebDriver driver)
	{
	    element = driver.findElement(By.id("muxer_ts_bitrate_1"));
	    return element;
	}
	
	
	
	//*********
	
	
	//NDIin*********
		//**********
	public  static WebElement Ndi_in_versa(WebDriver driver)
	{
		WebElement NDI_in = driver.findElement(By.id("versa_src_ndi"));
		NDI_in.click();
		return element;
	}
	
	//search_NDI 
	public  static WebElement Search_Ndi_versa(WebDriver driver)
	{
		WebElement Search_NDI = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[1]/div/div/div[5]/div[3]/div[6]/div/div[2]/a"));
		Search_NDI.click();
		return element;
	}
	
	
	//FILEsrteam out************		
	//Fileout CLu Name
		public  static WebElement Fileout_Cluster_Name(WebDriver driver)
		{
			WebElement sendkey = driver.findElement(By.id("cluster_name"));
			sendkey.sendKeys("Fileout");
			return element;
		}
		//Fileoutpath
		public  static WebElement Fileout_path(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_1"));
			return element;
		}
		
		
		
	//***************************
		
		
		
	//NDI out*******************
	//ndi
		public  static WebElement ndi(WebDriver driver)
		{
			WebElement ndi = driver.findElement(By.id("sink_ndi_ip"));
			ndi.click();
			return element;
		}
		
	//video
		public  static WebElement ndi_videoout(WebDriver driver)
		{
			WebElement video1 = driver.findElement(By.id("gstaf_sink_raw_video_ndi_1"));
			video1.sendKeys("av");
			return element;
		}
		
	//audio gstaf_sink_raw_audio_ndi_1
		public  static WebElement ndi_audio(WebDriver driver)
		{
			WebElement audio1 = driver.findElement(By.id("gstaf_sink_raw_audio_ndi_1"));
			audio1.sendKeys("av");
			return element;
		}
	
	//*************************
		
	//dashout******************
		public  static WebElement Native_Dash_HLS_out(WebDriver driver)
		{
			WebElement dash = driver.findElement(By.xpath("//*[@id=\"show_streamer\"] "));
			dash.click();
			return element;
		}
		
		//add streamer protocol
		public  static WebElement Add_streamer_Dash_HLS_protocol (WebDriver driver)
		{
			WebElement pro = driver.findElement(By.id("show_streamer_protocol"));
			pro.click();
			return element;
		}
		
		//Select protocol
		public  static WebElement Select_protocol_Dash_type (WebDriver driver)
		{
			Select dropdownb = new Select(driver.findElement(By.id("streamer_protocol_type")));  
			dropdownb.selectByVisibleText("DASH");
			return element;
		}
	//****************************	
	
		//hlsout******************
				
				//add streamer protocol
				public  static WebElement Add_streamer_protocol (WebDriver driver)
				{
					WebElement pro = driver.findElement(By.id("show_streamer_protocol"));
					pro.click();
					return element;
				}
				
				//Select protocol
				public  static WebElement Select_protocol_HLS_type(WebDriver driver)
				{
					Select dropdownb = new Select(driver.findElement(By.xpath("//*[@id=\"streamer_protocol_type\"]")));  
					dropdownb.selectByVisibleText("HLS");
					return element;
				}
			//****************************	
		
		
		
		
		
		
		
		
		
		
		
	//RTMP steamer_out******************
		// Add streamer add_streamer
		public  static WebElement add_streamer(WebDriver driver)
		{
			WebElement rtmp_add = driver.findElement(By.id("add_streamer"));
			rtmp_add.click();
			return element;
		}
	
	//***********************
		
		
		
	//RTSP *****************
		//show_streamer_rtsp 
		public  static WebElement add_RTSP_streamer(WebDriver driver)
		{
			WebElement rtmp_add = driver.findElement(By.id("show_streamer_rtsp"));
			rtmp_add.click();
			return element;
		}
		
		// streamer name streamer_name
		
		public  static WebElement Streamer_Name(WebDriver driver)
		{
			element = driver.findElement(By.id("streamer_name"));
			
			return element;
		}
		
		//show_streamer_rtmp
		public  static WebElement rtmp_streamer(WebDriver driver)
		{
			WebElement rtmp = driver.findElement(By.id("show_streamer_rtmp"));
			rtmp.click();
			return element;
		}
		
		
	//**********************
	//gstaf_src_file_stream_file_location Filelocation
	public  static WebElement Filein_location(WebDriver driver)
	{
	    WebElement path = driver.findElement(By.id("gstaf_src_file_stream_file_location"));
		path.sendKeys("/storage/device/SmokeQA/big_buck_bunny_1080p.mp4");
	    return element;
	}
	
	
	//Test Pattern versa_src_test_pattern
	public  static WebElement test_pattern(WebDriver driver)
	{
	    element = driver.findElement(By.id("versa_src_test_pattern"));
		return element;
	}
	
	//Thread
		public  static WebElement Thread(WebDriver driver) throws InterruptedException
		{
		   Thread.sleep(500);
			return element;
		}
	
	
	//Add Input add_pfmt_input
	public  static WebElement add_input(WebDriver driver)
	{
	    WebElement click5= driver.findElement(By.id("add_pfmt_input"));
		click5.click();
	    return element;
	}
	
	//Next input_next
	public  static WebElement input_next(WebDriver driver)
	{
	   WebElement click4  = driver.findElement(By.id("input_next"));
		click4.click();
	   return element;
	}
	
	//Process Next process_next
	public  static WebElement process_next(WebDriver driver)
	{
	    WebElement click3 = driver.findElement(By.id("process_next"));
		click3.click();
		return element;
	}
	
	//Add profile show_profile
	public  static WebElement Add_profile(WebDriver driver)
	{
		 WebElement click2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[6]/div/div[2]/a"));
		click2.click();
		 return element;
	}
	
	
	//profile*********
	//Select HD_profile pfmt_profile_preset
	public  static WebElement profile_HD_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_HD_854x480");
		return element;
	}
	
	//Select PAL_profile 
	public  static WebElement profile_PAL_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_PAL_720x576");
		return element;
	}
	
	//Select NTSC_profile 
		public  static WebElement profile_NTSC_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_NTSC_720x480");
			return element;
		}	
	
	//Select P2P_profile P2P_1920x1080
		public  static WebElement profile_P2P_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("P2P_1920x1080");
			return element;
		}
		
	//Select Bcast_profile
		public  static WebElement profile_Bcast_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("Uncompressed");
			return element;
		}
	
	//Select NDI profile
		public  static WebElement profile_NDI(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("Uncompressed");
			return element;
		}
		
	//************	
		
		
	//Cancel profile cancel_preset
		public  static WebElement Cancel(WebDriver driver)
		{
			 element = driver.findElement(By.id("cancel_preset"));
			return element;
		}
		
	//Profile Next profile_next
		public  static WebElement Next_Profile(WebDriver driver)
		{
			 WebElement click2 = driver.findElement(By.id("profile_next"));
			click2.click();
			 return element;
		}
		
	//Output FileStream sink_file_stream_archive
		public  static WebElement File_stream_Output(WebDriver driver)
		{
			 WebElement click1 = driver.findElement(By.id("sink_file_stream_archive"));
			click1.click();
			 return element;
		}
		
	//Output FileStream_name cluster_name
		public  static WebElement File_stream_Name(WebDriver driver)
		{
			 element = driver.findElement(By.id("cluster_name"));
			return element;
		}
		
	//muxer type ts**
		public  static WebElement muxer_ts(WebDriver driver)
		{

			Select dropdown = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdown.selectByVisibleText("MPEG TS");
			return element;
		}
		
	//muxer type mp4**
		public  static WebElement muxer_mp4(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MP4");
			return element;
		}
	
	//muxer type mkv**
		public  static WebElement muxer_mkv(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MKV");
			return element;
		}
		
	//muxer type mov**
		public  static WebElement muxer_mov(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MOV");
			return element;
		}
			
	//muxer type mov**
		public  static WebElement muxer_flv(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("FLV");
			return element;
		}
		
  //Output FileStream_pro1_hd gstaf_sink_file_location_1
		public  static WebElement File_stream_path_HD(WebDriver driver)
		{
			 element = driver.findElement(By.id("gstaf_sink_file_location_1"));
			return element;
		}
  //output FileStream_pro1_hd_muxer muxer_ts_bitrate_1
			public  static WebElement File_stream_HD_muxer_value(WebDriver driver)
				{
					element = driver.findElement(By.id("muxer_ts_bitrate_1"));
					return element;
				}
  //output Filestream_pro1_Add_track	
			public  static WebElement Add_track(WebDriver driver)
			{
				WebElement track = driver.findElement(By.linkText("Add Track"));
				track.click();
				return element;
			}
  //output Filestream video_track mpeg_ts_tracks_1_1
			public  static WebElement Add_video(WebDriver driver)
			{
				Select dropdown = new Select(driver.findElement(By.id("mpeg_ts_tracks_1_1")));  
				dropdown.selectByVisibleText("1_Video");
				return element;
			}
  //output Filestream audio_track mpeg_ts_tracks_1_1
			public  static WebElement Add_audio(WebDriver driver)
			{
				Select dropdown = new Select(driver.findElement(By.id("mpeg_ts_tracks_1_1")));  
				dropdown.selectByVisibleText("1_Audio");
				return element;
			}
	
			
			
	
			
			
 //mp4 location pro3
			public  static WebElement mp4_pro3_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_3"));
				return element;
			}
 //mp4 location pro4
			public  static WebElement mp4_pro4_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_4"));
				return element;
			}
			
			
			
			
			
		
	//okay
			public  static WebElement OK_button(WebDriver driver)
			{
				element = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/button"));
				return element;
			}
		
		
		
	//Output FileStream_pro2_pal gstaf_sink_file_location_1
		public  static WebElement File_stream_path_PAL(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_2"));
			return element;
		}
		
	//Output Filestream_pro2_pal muxer_ts_bitrate_2
		public  static WebElement File_stream_value_PAL(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_2"));
			return element;
		}
		
		
	//Output FileStream_pro3_ntsc gstaf_sink_file_location_1
		public  static WebElement File_stream_path_NTSC(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_3"));
			return element;
		}
		
	//muxer_ts_bitrate_3
	//Output Filestream_pro2_pal_muxer_value muxer_ts_bitrate_2
		public  static WebElement File_stream_value_NTSC(WebDriver driver)
		{
				element = driver.findElement(By.id("muxer_ts_bitrate_3"));
				return element;
		}
		
		
		
		
		
	//scroll
		public  static WebElement Scroll(WebDriver driver)
		{
			JavascriptExecutor jsss1 = (JavascriptExecutor) driver;
	  		jsss1.executeScript("scroll(0,1000)");
	  		return element;
		}
		
		//scroll up
		public  static WebElement Scroll_up(WebDriver driver)
		{
			JavascriptExecutor jsss1 = (JavascriptExecutor) driver;
			jsss1.executeScript("scroll(1000,0)");
			 return element;
		}
		
		
		
		
		
	//Output FileStream_pro3_P2P gstaf_sink_file_location_1
		public  static WebElement File_stream_path_P2P(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_4"));
			return element;
		}
		
	//Output FileStream_pro3_P2P_muxer_value	
		public  static WebElement File_stream_P2P_Value(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_4"));
			return element;
		}
	
		
		
	//Output FileStream_pro3_Bcast gstaf_sink_file_location_1
		public  static WebElement File_stream_path_Bcast(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_5"));
			return element;
		}
	
	//Output FileStream_pro3_Bcast_muxer_value	
		public  static WebElement File_stream_Bcast_muxer_Value(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_5"));
			return element;
		}
		
	//ADD Output create_output
		public  static WebElement Add(WebDriver driver)
		{
			WebElement Click = driver.findElement(By.id("create_output"));
			Click.click();
			return element;
		}
				
	//ADD Job job_create
		public  static WebElement Add_job(WebDriver driver)
		{
			WebElement click = driver.findElement(By.id("job_create"));
			click.click();
			return element;
		}
		
	//Job_Name job_name
		public  static WebElement Job_Name(WebDriver driver)
		{
		
			element = driver.findElement(By.id("job_name"));
			return element;
		}
	
		
	
	//Start job job_counter_start_0
		public  static WebElement Job_Start(WebDriver driver)
		{
			WebElement start= driver.findElement(By.id("job_counter_start_0"));
			start.click();
			return element;
		}
		
	//Stop job job_counter_stop_0
		public  static WebElement Job_Stop(WebDriver driver)
		{
			WebElement stop= driver.findElement(By.id("job_counter_stop_0"));
			stop.click();
			return element;
		}
		
		
	//Slicing file_sink_slicing
		//size
		public  static WebElement Job_Slicing_Size(WebDriver driver)
		{
			Select dropdowna = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdowna.selectByVisibleText("Size");
			//max size
			driver.findElement(By.id("file_sink_max_slice_size")).clear();
			driver.findElement(By.id("file_sink_max_slice_size")).sendKeys("1");
			return element;
		}
		
		//time
		public  static WebElement Job_Slicing_Time(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdown.selectByVisibleText("Time");
			return element;
		}
		//clock
		public  static WebElement Job_Slicing_clock(WebDriver driver)
		{
			Select dropdownb = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdownb.selectByVisibleText("Clock");
			//Slice_Dur_file_sink_slicing_clock
			Select dropdownc = new Select(driver.findElement(By.id("file_sink_slicing_clock")));  
			dropdownc.selectByVisibleText("5");
			return element;
		}
	
		//all jobs all_active
		public  static WebElement All_jobs_list(WebDriver driver)
		{
			WebElement all= driver.findElement(By.id("all_active"));
			all.click();
			return element;
		}
		
		
		
}
