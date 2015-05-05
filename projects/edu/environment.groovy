environments {
    mine {
        jdbc{
            driverClassName="com.mysql.jdbc.Driver"
            url="jdbc:mysql://mysql:3306/daedu?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull"
            username="admin"
            password="abcd1234"
            maxPoolSize="100"
            minPoolSize="10"
            initialPoolSize="5"
            idleConnectionTestPeriod=1800
            maxIdleTime=3600
        }
        memcached{
            server1="memcached:11211"
            server2="memcached:11211"
            opTimeout=3
            opTimeoutBulk=3
            retry=1
            readBufSize=16384
            opQueueLen=16384
            expHour=24
            // 0 不使用 1 使用
            isUse=1
        }
        email{
            host="smtp.163.com"
            username="da@163.com"
            password=""
        }
        project{
            contextPath="http://daedu.org"
            examPath="http://exam.daedu.org"
//            snsPath
            //图片、CSS、JS等静态资源文件地址
            staticServer="http://daedu.org"
            //静态资源上传服务地址
            uploadImageServer="http://static.daedu.org"
            //静态资源访问地址
            staticImage="http://static.daedu.org"
            mydomain=".daedu.org"
            projectName="da-edu"

        }
        hessian{
            auth="hessainAuth"
        }
        lucene{
            luceneIndexDir="/data/htdocs/lucene/eduplat/index/{0}"
            luceneIndexDirBak="/data/htdocs/lucene/eduplat/luceneIndexBak/{0}"
            alertemail="da@9anbi.com"
        }

        alipay{
            // 合作身份者id，以2088开头的16位纯数字
            defaultPartner=2088123412341234
            defaultSeller="xxxx@xxxx.com"
            // 商户私钥，自助生成即rsa_private_key.pem中去掉首行，最后一行，空格和换行最后拼成一行的字符串 rsa_private_key.pem这个文件等你申请支付宝签约成功后，按照文档说明你会生成的
            privateKey="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBALyIhuOXfmLD46xn38DR2snr6iAfIIJkEN1pqa"
            // 支付宝公钥,用签约支付宝账号登录ms.alipay.com后，在密钥管理页面获取
            publicKey=""

        }

    }
    test {
        jdbc{
            driverClassName="com.alibaba.druid.pool.DruidDataSource"
            url="jdbc:mysql://mysql:3306/daedu?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull"
            username="root"
            password="root2015"
            maxPoolSize="100"
            minPoolSize="10"
            initialPoolSize="5"
            idleConnectionTestPeriod=1800
            maxIdleTime=3600
        }
        memcached{
            server1="memcached:11211"
            server2="memcached:11211"
            opTimeout=3
            opTimeoutBulk=3
            retry=1
            readBufSize=16384
            opQueueLen=16384
            expHour=24
            // 0 不使用 1 使用
            isUse=1
        }
        email{
            host=""
            username=""
            password=""
        }
        project{
            contextPath=""
            examPath=""
//            snsPath
            //图片、CSS、JS等静态资源文件地址
            staticServer=""
            //静态资源上传服务地址
            uploadImageServer=""
            //静态资源访问地址
            staticImage=""
            projectName=""

        }
        hessian{
            auth="hessainAuth"
        }
        lucene{
            luceneIndexDir=""
            luceneIndexDirBak=""
            alertemail=""
        }

        alipay{
            // 合作身份者id，以2088开头的16位纯数字
            defaultPartner=2088123412341234
            defaultSeller="xxxx@xxxx.com"
            // 商户私钥，自助生成即rsa_private_key.pem中去掉首行，最后一行，空格和换行最后拼成一行的字符串 rsa_private_key.pem这个文件等你申请支付宝签约成功后，按照文档说明你会生成的
            privateKey="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBALyIhuOXfmLD46xn38DR2snr6iAfIIJkEN1pqa"
            // 支付宝公钥,用签约支付宝账号登录ms.alipay.com后，在密钥管理页面获取
            publicKey=""

        }

    }
    release {
        jdbc{
            driverClassName="com.alibaba.druid.pool.DruidDataSource"
            url="jdbc:mysql://mysql:3306/demo_web_v2_1?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull"
            username="root"
            password="root2015"
            maxPoolSize="100"
            minPoolSize="10"
            initialPoolSize="5"
            idleConnectionTestPeriod=1800
            maxIdleTime=3600
        }
        memcached{
            server1="memcached:11211"
            server2="memcached:11211"
            opTimeout=3
            opTimeoutBulk=3
            retry=1
            readBufSize=16384
            opQueueLen=16384
            expHour=24
            // 0 不使用 1 使用
            isUse=1
        }
        email{
            host=""
            username=""
            password=""
        }
        project{
            contextPath=""
            examPath=""
//            snsPath
            //图片、CSS、JS等静态资源文件地址
            staticServer=""
            //静态资源上传服务地址
            uploadImageServer=""
            //静态资源访问地址
            staticImage=""
            projectName=""

        }
        hessian{
            auth="hessainAuth"
        }
        lucene{
            luceneIndexDir=""
            luceneIndexDirBak=""
            alertemail=""
        }

        alipay{
            // 合作身份者id，以2088开头的16位纯数字
            defaultPartner=2088123412341234
            defaultSeller="xxxx@xxxx.com"
            // 商户私钥，自助生成即rsa_private_key.pem中去掉首行，最后一行，空格和换行最后拼成一行的字符串 rsa_private_key.pem这个文件等你申请支付宝签约成功后，按照文档说明你会生成的
            privateKey="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBALyIhuOXfmLD46xn38DR2snr6iAfIIJkEN1pqa"
            // 支付宝公钥,用签约支付宝账号登录ms.alipay.com后，在密钥管理页面获取
            publicKey=""

        }

    }
}
