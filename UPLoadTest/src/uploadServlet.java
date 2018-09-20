import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class uploadServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        // 上传文件名
        String uploadFileName = "";
        // 表单字段元素的name属性
        String filedName = "";
        // 请求request中的内容是否是multipart类型
        boolean ismultipart = ServletFileUpload.isMultipartContent(request);
        // 上传文件的存储路径
        String uploadFilePath = request.getSession().getServletContext().getRealPath("upload");

        System.out.println(uploadFilePath);

        if(ismultipart){
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // 创建临时文件目录路径
            File tempPath = new File("f:\\java练习");
            // 设置缓冲区大小
            factory.setSizeThreshold(10240);
            // 设置临时文件存放
            factory.setRepository(tempPath);
            ServletFileUpload upload = new ServletFileUpload(factory);
            // 设置上传单个文件最大是200k
            upload.setSizeMax(204800);

            try {
                List<FileItem> items = upload.parseRequest(request);
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();
                    if (!item.isFormField()) {
                        String fileName = item.getName();
                        if (fileName != null && !("").equals(fileName)) {
                            // 获取文件上传的类型
                            String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
                            // 控制文件的格式
                            if ("jpg".equals(ext)) {
                                File saveFile = new File(uploadFilePath, fileName);

                                item.write(saveFile);
                                out.println("上传成功26");
                                return;
                            } else if ("png".equals(ext)) {
                                File saveFile = new File(uploadFilePath, fileName);

                                item.write(saveFile);
                                out.println("上传成功27");
                                return;
                            }
                        }
                    }
                }
            }catch(FileUploadBase.SizeLimitExceededException e){
                out.println("上传文件大于200k,上传失败");
            }catch(Exception e){

                System.out.println(e.getStackTrace());
                System.out.println("异常");
            }finally {
                out.close();
            }

        }

        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    /*    request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("123456");
        PrintWriter out = response.getWriter();
        // 上传文件名
        String uploadFileName = "";
        // 表单字段元素的name属性
        String filedName = "";
        // 请求request中的内容是否是multipart类型
        boolean ismultipart = ServletFileUpload.isMultipartContent(request);
        // 上传文件的存储路径
        String uploadFilePath = request.getSession().getServletContext().getRealPath("upload/");
        if(ismultipart){
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try{
                List<FileItem> items = upload.parseRequest(request);
                Iterator<FileItem> iter = items.iterator();
                while(iter.hasNext()){
                    FileItem item = (FileItem) iter.next();
                    if (!item.isFormField()){
                        String fileName = item.getName();
                        if (fileName != null && !("").equals(fileName)){
                            File saveFile = new File(uploadFilePath);

                            item.write(saveFile);
                            out.println("上传成功");
                            return ;
                        }
                    }
                }
            }catch(Exception e){
                System.out.println(e.getStackTrace());
                System.out.println("异常");
            }

        }*/
    }
}
