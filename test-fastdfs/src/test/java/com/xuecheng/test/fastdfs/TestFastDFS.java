package com.xuecheng.test.fastdfs;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFastDFS {

    //上传文件

    @Test
    public void test() {
        try {
            //加载fastdfs-client.properties配置文件
            ClientGlobal.initByProperties( "config/fastdfs-client.properties" );
            //定义TrackerClient，用于请求TravkerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();
            //获取Storage
            StorageServer storeStorage = trackerClient.getStoreStorage( trackerServer );
            //创建storageClient
            StorageClient1 storageClient1 = new StorageClient1( trackerServer, storeStorage );
            //向storage服务器上传文件
            //本地文件路径
            String filePath = "d:/需求分析第一次评审会.jpg";
            //上传成功后拿到文件的id
            String fileId = storageClient1.upload_file1( filePath, "jpg", null );
            System.out.println( fileId );

        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }


    }
    //下载文件

    @Test
    public void download() {
        try {
            //加载fastdfs-client.properties配置文件
            ClientGlobal.initByProperties( "config/fastdfs-client.properties" );
            //定义TrackerClient，用于请求TravkerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();
            //获取Storage
            StorageServer storeStorage = trackerClient.getStoreStorage( trackerServer );
            //创建storageClient
            StorageClient1 storageClient1 = new StorageClient1( trackerServer, storeStorage );
            //下载文件
            //文件id
            String fileId = "group1/M00/00/01/CgAral2AQUeAJ_IiAAJWakLAsPc989.jpg";
            byte[] bytes = storageClient1.download_file1( fileId );
            //
            FileOutputStream fileOutputStream = new FileOutputStream( new File( "e:/需求分析第一次评审会.jpg" ) );
            fileOutputStream.write( bytes );

        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    //查询文件
    @Test
    public void testQueryFile()
            throws IOException, MyException {
        //加载fastdfs-client.properties配置文件
        ClientGlobal.initByProperties( "config/fastdfs-client.properties" );
        //定义TrackerClient，用于请求TravkerServer
        TrackerClient trackerClient = new TrackerClient();
        //连接tracker
        TrackerServer trackerServer = trackerClient.getConnection();
        //获取Storage
        StorageServer storeStorage = trackerClient.getStoreStorage( trackerServer );
        //创建storageClient
        StorageClient1 storageClient = new StorageClient1( trackerServer, storeStorage );
        FileInfo fileInfo = storageClient.query_file_info("group1",
                "group1/M00/00/01/wKhlQFqO0OGAFyhGAAA-8SWa8Qc537.jpg" );
        System.out.println(fileInfo);
    }
}
