# SpringBatchExample number 1
As I am new to SpringBatch, I wanted to practice a little this new technology, so this is my first Spring Batch project. 

It's a simple batch that reads data from a file, process these datas and write the updated data into a file. 
There are 2 jobs, the first one extract products from a file, process them by adding a category and then rewrite them in a new file. The second job, takes the last file,  applies a conversion (currency) and then write the results into another file. 

Uses:ChunkOrientedTasklets with FlatFileWriter, FlatFileReader, ItemProcessor .. 
