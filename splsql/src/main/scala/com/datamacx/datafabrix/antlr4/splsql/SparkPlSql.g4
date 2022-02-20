grammar SparkPlSql;

import SqlBase;

multipleStatement
    : (singleStatement)+ EOF
    ;