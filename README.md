CPEN 221 / Fall 2015
Programming Proficiency Test
=========

November 25, 2015

## General Instructions

+ There are two questions that you need to complete.
+ You have 125 minutes (2h 5m) to complete the tasks.
+ You will start at 5:00 p.m. and finish before 7:05 p.m.
+ We will start cloning repositories at **7:07 p.m.** so you should have committed all your work to Github by that time (see submission instructions below).
+ Take your time to read the questions. 
+ Skeleton code can be obtained by cloning this repository. Add JUnit to your build path in Eclipse.
+ Best of luck!

## Submission Instructions

+ Create a branch `ppt-2015-3` to your assigned course repository on Github. You should commit all your work to this branch of the repository.
	+ Make sure you name your branch correctly.
	+ Do not alter the directory/folder structure. You should retain the structure as in this repository.
	+ Only push work related to this test to the `ppt-2015-2` branch of your assigned Github repository.
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _I would recommend that you get your Git and Github workflow set up at the start._

## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person in completing the examination.
+ You did not aid any other person in the class in completing their examination.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the examination then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this examination.

> Violations of this honour code will be treated as a case of academic misconduct and will dealt with under UBC policies governing such issues. A consequence of this may be to nullify this exam for everyone that submits work for grading!

## Question 1: Gifting Spree

> The skeleton source code for this question is in the package `giftingSpree`. You have to implement the method _getMaximumItems_ in the class _GiftingSpree_.

It is Christmas time and you are returning home. You promised to buy gifts for all for nephews and nieces and never got the time in Vancouver with all your coursework at UBC.

Your only opportunity is to buy as many gift items as possible at the Vancouver Airport. You have _X_ dollars to spend, and the items available at the airport are represented by a list where each entry is the price of an item (the i<sup>th</sup> entry in the list is the price of item i). You decide to buy as many items as possible. 

Implement a method that determines the maximum number of items that you can buy. The method takes as input your budget and the price list. All valid items have prices greater than 0, so your method should _ignore_ items in the price list that are indicated as having prices that are less than or equal to 0.

#### Examples

+ Budget: 4, Price List: [2, 2, 2]
	+ Returns: 2

+ Budget: 5, Price List: [5, 6, 1]
	+ Returns: 1

+ Budget: 5, Price List: [7, 6, 6]
	+ Returns: 0

+ Budget: 6, Price List: [1, 1, 1, 1, 1]
	+ Returns: 5

+ Budget: 7, Price List: [0, 4, 3, 1, 2, 0]
	+ Returns: 3

## Packing Cubes

> The skeleton source code for this question is in the package `packingcubes`. You have to implement the method _getMinimumCost_ in the class _PackingCubes_.

You have been asked to pack some expensive 1 x 1 x 1 cubes into a cuboid box of custom size that can accommodate all the cubes with no space for the cubes to move. If the cubes move after a box is packed then they may get damaged during shipping.

The cost of a box with dimensions d<sub>1</sub> x d<sub>2</sub> x d<sub>3</sub> is d<sub>1</sub>+d<sub>2</sub>+d<sub>3</sub>. 

Return the **minimum cost** of a cuboid box that can hold a given number, _N_, of 1 x 1 x 1 cubes.

#### Examples

+ N: 1
	+ Returns: 3
	+ The box should be of size 1 x 1 x 1.

+ N: 6
	+ Returns: 6

+ N: 7
	+ Returns: 9

+ N: 25
	+ Returns: 11

+ N: 200
	+ Returns: 18

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional standard Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.

## Answers to FAQs

#### Can I consult Java documentation and other Internet-based sources?

Yes, you can. The point of this test is not to demonstrate mastery over syntax but that you can solve a problem in a reasonable amount of time with reasonable resources.

*If you find useful information online outside the official Java documentation and the course material, you must cite the source. You should do so by adding comments in your source code.*

Naturally you are expected to adhere to all of the course and UBC policies on academic integrity. 

#### Isn't two hours too short to produce working implementations?

The questions are straightforward, and these are not very different from what one might sometimes encounter on a job interview (for example). The difference is that you get less time during an interview (10-15 minutes) with no access to additional resources. So the time alloted is reasonable in that regard and I am expecting that most of you will be clear this bar. And you will have to keep working until you clear this bar. The goal is that it is possible to say, at a minimal level, what everyone who completes this course can achieve.

#### Why am I not guaranteed full credit if my implementation passes all the provided tests?

It is easy to develop an implementation that passes the provided tests and not much else. A good-faith implementation that passes all the provided tests is very likely to pass other tests too.