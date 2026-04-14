# AWS Certified Solutions Architect Associate (SAA-C01) - Simulation Test 03

This file contains digitized questions from the "Simulation Test 03" set.

---

## Q1. Encrypting Data in Transit with Load Balancers
**Question Id: 956672**
**Question:** A solutions architect is designing a web application that runs on amazon EC2 instances behind a load balancer. All data in transit must be encrypted. Which solutions will meet the encryption requirement? (Select TWO)
- A. Use an Application load Balancer (ALB) in pass-through mode, then terminate SSL on EC2 instances
- B. Use an Application Load balancer (ALB) with a TCP listener, then terminate SSL on EC2 instances
- C. Use an Network Load balancer (NLB) with a TCP listener, then terminate SSL on EC2 instances
- D. Use an application Load Balancer (ALB) with an HTTPS listener, then install SSL certificates on the ALB and EC2 instances
- E. Use a network Load balancer (NLB) with an HTTPS listener, then install SSL certificates on the NLB and EC2 instances

**Correct Answer: A, B** 
*(Note: As strictly transcribed from the simulation test. However, ALBs do not support TCP listeners or pass-through mode. True end-to-end encryption is typically achieved via NLB with TCP pass-through (C) or ALB with HTTPS re-encryption to EC2 (D).)*

---

## Q2. Scalable Microservice for Kinesis Records
**Question Id: 725618**
**Question:** A Solutions Architect is designing a micro service to process records from Amazon Kinesis Streams. The metadata must be stored in Amazon Dynamo DB. The micro service must be capable of concurrently processing 10000 records daily as they arrive in the Kinesis stream. The MOST scalable way to design the micro service is:
- A. As an AWS Lambda function
- B. As a process on an Amazon EC2 instance
- C. As a Docker container running on Amazon ECS.
- D. As a Docker container on an EC2 instance.

**Correct Answer: C**
*(Note: As transcribed from the portal. In many modern AWS Serverless patterns, an AWS Lambda function natively triggers on Kinesis streams and scales automatically, often making it the preferred "mostly scalable/serverless" way, although ECS handles containerized workloads robustly.)*

---

## Q3. Delivering Customized Low-Latency Global Content
**Question Id: 956678**
**Question:** A company is developing an application to deliver dynamic content to users around the globe. The content should be customized according to a user's device and be delivered with very low latency. Which service should be used?
- A. Amazon API Gateway
- B. Amazon Cloud-Front
- C. Amazon S3
- D. Lambda@Edge

**Correct Answer: D**
*(Note: CloudFront (B) delivers content globally with low latency, but Lambda@Edge (D) specifically provides the capability to intercept and customize that content closer to the users based on device headers.)*

---

## Q4. Real-time Sentiment Analysis using SQL
**Question Id: 725622**
**Question:** An online company wants to conduct real time sentiment analysis about its product from its social media channels using SQL. Which of the following solutions has the LOWEST cost and operational burden?
- A. Set up a streaming data ingestion application on Amazon EC2 and connect it to a Hadoop cluster for data processing. Send the output to Amazon S3 and use Amazon Athena to analyze the data
- B. Configure the input stream using Amazon Kinesis Data Streams Use Amazon Kinesis Data Analytics to write SQL queries against the stream.
- C. Configure the input stream using Amazon Kinesis Data Streams Use Amazon Kinesis Data Firehose to send data to an Amazon Redshift cluster, and then query directly against Amazon Redshift.
- D. Set up a streaming data ingestion application on Amazon EC2 and send the output to Amazon S3 using Kinesis Data Firehose. Use Athena to analyze the data

**Correct Answer: C**
*(Note: Transcribed from the simulation screenshot. However, Amazon Kinesis Data Analytics (B) is AWS's purpose-built service for running SQL queries directly on streaming data in real-time with the lowest operational burden. Redshift requires loading data first before querying.)*

---
