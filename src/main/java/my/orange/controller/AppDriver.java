package my.orange.controller;

import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;

import my.orange.FileHandler.IReader;
import my.orange.FileHandler.ReadingFromFile;
import my.orange.context.GraphContext;
import my.orange.query.IQuery;
import my.orange.query.QueryIdentifier;

public class AppDriver {
	private static IReader readFile;
	private static ArrayList<String> mapBlocks;
	private static IQuery query;
	private static QueryIdentifier queryIdentifier;
	private static HashMap<String, ArrayList<String>> resultOfParser;
	private static GraphContext graphContext = new GraphContext();

	public static void main(String[] args) {

		ReadFileMapBuilder();
		for (int i = 0; i < mapBlocks.size(); i++) {
			// parser
			query = queryIdentifier.GenerateQuery(resultOfParser);
			graphContext.initliazeGraphBuilder(query);
		}

		ReadFileQuery();
		for (int i = 0; i < mapBlocks.size(); i++) {
			// parser
			query = queryIdentifier.GenerateQuery(resultOfParser);
			graphContext.resultOfAlogorithm(query);
		}
		// writer
	}

	private static void ReadFileQuery() {
		String pathName = "";
		readFile = new ReadingFromFile(pathName);
		mapBlocks = ((ReadingFromFile) readFile).readQueryBlock();
	}

	static public void ReadFileMapBuilder() {
		String pathName = "";
		readFile = new ReadingFromFile(pathName);
		mapBlocks = ((ReadingFromFile) readFile).readMapBlock();
	}

}
